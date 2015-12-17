"""The LinkedList code from before is provided below.
Add three functions to the LinkedList.
"get_position" returns the element at a certain position.
The "insert" function will add an element to a particular
spot in the list.
"delete" will delete the first element with that
particular value.
Then, use "Test Run" and "Submit" to run the test cases
at the bottom."""

class Element(object):
    def __init__(self, value):
        self.value = value
        self.next = None

class LinkedList(object):
    def __init__(self, head=None):
        self.head = head

    def append(self, new_element):
        current = self.head
        if self.head:
            while current.next:
                current = current.next
            current.next = new_element
        else:
            self.head = new_element

    def get_position(self, position):
        """Get an element from a particular position.
        Assume the first position is "1".
        Return "None" if position is not in the list."""
        ind = 0
        res = None
        current = self.head
        while current:
            ind += 1
            if ind == position:
                res = current
            else:
                current = current.next
        return res

    def insert(self, new_element, position):
        """Insert a new node at the given position.
        Assume the first position is "1".
        Inserting at position 3 means between
        the 2nd and 3rd elements."""
        found = self.get_position(position)
        if found:
            left = self.get_position(position - 1)
            right = left.next
            new_element.next = right
            left.next = new_element
        else:
            raise IndexError("Position not found")

    def delete(self, value):
        """Delete the first node with a given value."""
        current = self.head
        prev = None
        while current:
            if current.value == value:
                if prev:
                    prev.next = current.next
                else:
                    self.head = current.next
                    prev = self.head
                break
            else:
                prev = current
                current = current.next


    def printll(self):
        cr = self.head
        print '-' * 10
        while cr:
            print cr.value
            cr = cr.next
        print '-' * 10



# Test cases
# Set up some Elements
e1 = Element(1)
e2 = Element(2)
e3 = Element(3)
e4 = Element(4)

# Start setting up a LinkedList
ll = LinkedList(e1)
ll.append(e2)
ll.append(e3)

# Test get_position
# Should print 3
print ll.head.next.next.value
# Should also print 3
print ll.get_position(3).value

# Test insert
ll.insert(e4,3)
# # Should print 4 now
print ll.get_position(3).value

# Test delete
ll.printll()
ll.delete(2)
ll.printll()
# Should print 2 now
print ll.get_position(1).value
# Should print 4 now
print ll.get_position(2).value
# Should print 3 now
print ll.get_position(3).value