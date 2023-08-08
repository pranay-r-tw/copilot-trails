arr=("a", "b", "c")
echo "${arr[@]}"

# iterate over each element in the array and print it:
for i in "${arr[@]}"
do
    echo "arr: $i"
done

# Array elements are split by spaces, so if an element has spaces, you need to wrap it in quotes:
array=("one" "two" "three")

for element in "${array[@]}"
do
    echo $element
done