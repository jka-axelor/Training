package com.axelor.demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import com.axelor.db.Model;
import com.axelor.db.Query;
import com.axelor.employees.db.Employees;
import com.axelor.employees.db.repo.EmployeesRepository;
import com.axelor.inject.Beans;
import com.axelor.mail.service.MailServiceImpl;
import com.google.common.base.Joiner;


public class MyMailservice extends MailServiceImpl {

  @Override
  public Model resolve(String email) {
    final EmployeesRepository contacts = Beans.get(EmployeesRepository.class);
    final Employees contact = contacts.findename("eName");
    if (contact != null) {
      return contact;
    }
    return super.resolve(email);
  }

  /** Override to return contact email addresses. */
  @Override
  public List<InternetAddress> findEmails(String matching, List<String> selected, int maxResult) {

    final List<String> where = new ArrayList<>();
    final Map<String, Object> params = new HashMap<>();

    where.add("self.email is not null");

    if (!isBlank(matching)) {
      where.add(
          "(LOWER(self.email) like LOWER(:email) OR LOWER(self.fullName) like LOWER(:email))");
      params.put("email", "%" + matching + "%");
    }
    if (selected != null && !selected.isEmpty()) {
      where.add("self.email not in (:selected)");
      params.put("selected", selected);
    }

    final String filter = Joiner.on(" AND ").join(where);
    final Query<Employees> query = Query.of(Employees.class);

    if (!isBlank(filter)) {
      query.filter(filter);
      query.bind(params);
    }

    final List<InternetAddress> addresses = new ArrayList<>();
    for (Employees contact : query.fetch(maxResult)) {
      try {
        final InternetAddress item = new InternetAddress(contact.geteName());
        addresses.add(item);
      } catch (AddressException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }

    return addresses;
  }

private boolean isBlank(String filter) {
	// TODO Auto-generated method stub
	return false;
}
}