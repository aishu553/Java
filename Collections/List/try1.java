List<Integer> list = new ArrayList<>();

list.add(x);                    // add
list.add(index, x);             // insert
list.get(index);                // access
list.set(index, x);             // replace
list.remove(index);             // remove by index
list.remove(Integer.valueOf(x)); // remove by value
list.size();                    // size
list.contains(x);               // exists?
list.indexOf(x);                // first index
list.lastIndexOf(x);            // last index

Collections.sort(list);         // ascending
Collections.reverse(list);      // reverse
Collections.min(list);          // minimum
Collections.max(list);          // maximum
Collections.frequency(list, x); // frequency
list.clear();                   // remove everything
