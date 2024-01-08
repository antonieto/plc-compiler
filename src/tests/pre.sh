plc_path=./plc-test
plx_path=./plx-test

create_plc_test() {
	./plc plc-test/$1.pl > ./ctd-out/$1.ctd
	./ctd ctd-out/$1.ctd > ./plc-out/$1.plout
}

create_plx_test() {
	./plxc plx-test/$1.plx > ./ctd-out/$1.ctd
	./ctd ctd-out/$1.ctd > ./plx-out/$1.plxout
}

for path in "$plc_path"/*; do
	file_name=$(basename -- "$path")
	without_extension="${file_name%.*}"
	create_plc_test "$without_extension"
done

for path in "$plx_path"/*; do
	file_name=$(basename -- "$path")
	without_extension="${file_name%.*}"
	create_plx_test "$without_extension"
done

