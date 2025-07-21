private class SllNode{
    int data;
    SllNode next;
}

private class Sll {
    SllNode head;

    public int length() {

	int length = 0;

	while(this.head != null){
	    this.head = this.head.next;
	    length += 1;
	}

	return length;
    }
}

