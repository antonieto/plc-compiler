folder_path=./plc-test

create_test_from() {
	./plc plc-test/$1.pl > ./ctd-out/$1.ctd
	./ctd ctd-out/$1.ctd > ./plc-out/$1.plout
}

for path in "$folder_path"/*; do
	file_name=$(basename -- "$path")
	without_extension="${file_name%.*}"
	create_test_from "$without_extension"
done

