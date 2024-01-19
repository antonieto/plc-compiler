contents=("PLXC.cup" "PLXC.flex" "PLXC.java" "lib" "java_cup" )
output="plxc.zip"

# Delete .class files first
rm lib/*.class
zip -r "$output" "${contents[@]}"

echo "Zip file created"
