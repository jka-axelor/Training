#!/bi/sh

p=/home/axelor/Training/Task1
mkdir xml

for file in $p
do
	cp *.xml xml/

        rename -v '#' '' *.txt
	rename -v '@' '' *.txt
	rename -v '%' '' *.txt
	rename -v '$' '' *.txt
	rename -v '%' '' *.txt
	rename -v '^' '' *.txt
	rename -v '&' '' *.txt
	rename -v '*' '' *.txt


done

grep -l "@gmail.com" *.txt > EmailAddressFiles.txt

grep -h "@gmail.com" *.txt > EmailAddresses.txt

sed 's/@gmail.com/@axelor.com/' EmailAddresses.txt
