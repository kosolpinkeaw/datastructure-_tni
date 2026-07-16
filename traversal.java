UNCTION traversal():
 SET node = head // point node to the first element (head) of the list
 CREATE result = "" // initialize an empty string to collect the output
 WHILE node IS NOT null: // loop until node reaches the end of the list
 UPDATE result += node.data // append the current node's data to result
 UPDATE node = node.next // move node forward to the next node in the list
 END WHILE
 RETURN result // return the final string containing all node
END FUNCTION