# Java Collection Framework

The **Java Collection Framework (JCF)** provides a set of interfaces and classes for storing and manipulating groups of objects. The core interface for working with collections in Java is **`Collection<E>`**, which is part of **`java.util`** package.

## 1. List Interface (`java.util.List`)
- **Ordered** collection that allows **duplicates**.
- **Index-based** access (like an array).

### **Types of List in Java**
| Implementation | Description |
|--------------|-------------|
| **ArrayList** | Dynamic array, fast random access, slow insert/delete |
| **LinkedList** | Doubly linked list, fast insert/delete, slow random access |
| **Vector** | Synchronized, slower than ArrayList |
| **Stack** | Extends Vector, LIFO (Last In, First Out) |

### **Methods in `List` Interface**
| Method | Description |
|--------|-------------|
| `add(E e)` | Adds an element to the list |
| `get(int index)` | Returns the element at the specified index |
| `set(int index, E element)` | Updates an element at a given index |
| `remove(int index)` | Removes the element at the given index |
| `indexOf(Object o)` | Returns the index of the first occurrence of the element |
| `size()` | Returns the number of elements in the list |
| `contains(Object o)` | Checks if the list contains the element |
| `isEmpty()` | Checks if the list is empty |
| `clear()` | Removes all elements from the list |
| `iterator()` | Returns an iterator for traversing the list |

---

## 2. Set Interface (`java.util.Set`)
- **No duplicate** elements allowed.
- **Unordered** collection.

### **Types of Set in Java**
| Implementation | Description |
|--------------|-------------|
| **HashSet** | Unordered, allows `null`, fast operations (O(1) complexity) |
| **LinkedHashSet** | Ordered by insertion order, allows `null` |
| **TreeSet** | Sorted set (Natural ordering / Comparator), implemented using **Red-Black Tree** |

### **Methods in `Set` Interface**
| Method | Description |
|--------|-------------|
| `add(E e)` | Adds an element if it's not already present |
| `remove(Object o)` | Removes an element |
| `contains(Object o)` | Checks if an element exists |
| `size()` | Returns the number of elements |
| `isEmpty()` | Checks if the set is empty |
| `clear()` | Removes all elements |
| `iterator()` | Returns an iterator |

---

## 3. Queue Interface (`java.util.Queue`)
- **FIFO (First In, First Out)**
- Used for processing elements in **order**.

### **Types of Queue in Java**
| Implementation | Description |
|--------------|-------------|
| **PriorityQueue** | Ordered based on **natural ordering** or **custom comparator** |
| **LinkedList (Queue Implementation)** | Used as a **FIFO queue** |

### **Methods in `Queue` Interface**
| Method | Description |
|--------|-------------|
| `add(E e)` | Adds an element (throws exception if full) |
| `offer(E e)` | Adds an element (returns false if full) |
| `remove()` | Removes and returns the head element (throws exception if empty) |
| `poll()` | Removes and returns the head element (returns null if empty) |
| `element()` | Returns the head element without removing (throws exception if empty) |
| `peek()` | Returns the head element without removing (returns null if empty) |

---

## 4. Deque Interface (`java.util.Deque`)
- **Double-ended queue** (can be used as Stack and Queue).

### **Types of Deque in Java**
| Implementation | Description |
|--------------|-------------|
| **ArrayDeque** | Resizable-array implementation of a deque |
| **LinkedList (Deque Implementation)** | Doubly linked list implementation |

### **Methods in `Deque` Interface**
| Method | Description |
|--------|-------------|
| `addFirst(E e)` | Adds element at the front |
| `addLast(E e)` | Adds element at the back |
| `removeFirst()` | Removes and returns the first element |
| `removeLast()` | Removes and returns the last element |
| `getFirst()` | Returns first element without removing |
| `getLast()` | Returns last element without removing |

---

## 5. Map Interface (`java.util.Map`)
- **Key-Value pair** storage.
- **Keys are unique**, but values can be **duplicate**.

### **Types of Map in Java**
| Implementation | Description |
|--------------|-------------|
| **HashMap** | Unordered, allows one `null` key and multiple `null` values |
| **LinkedHashMap** | Ordered by insertion order |
| **TreeMap** | Sorted map (Natural ordering / Comparator), implemented using **Red-Black Tree** |
| **Hashtable** | Synchronized, does not allow `null` keys/values |

### **Methods in `Map` Interface**
| Method | Description |
|--------|-------------|
| `put(K key, V value)` | Adds a key-value pair |
| `get(Object key)` | Returns value for the given key |
| `remove(Object key)` | Removes key-value pair |
| `containsKey(Object key)` | Checks if key exists |
| `containsValue(Object value)` | Checks if value exists |
| `size()` | Returns number of key-value pairs |
| `isEmpty()` | Checks if map is empty |
| `clear()` | Removes all key-value pairs |
| `keySet()` | Returns a set of all keys |
| `values()` | Returns a collection of values |

---

## Summary Table
| Collection Type | Allows Duplicates? | Ordered? | Sorted? |
|----------------|------------------|---------|---------|
| **List** | ✅ Yes | ✅ Yes | ❌ No |
| **Set** | ❌ No | ❌ No (except `LinkedHashSet`) | ✅ `TreeSet` |
| **Queue** | ✅ Yes | ✅ Yes | ❌ No (except `PriorityQueue`) |
| **Deque** | ✅ Yes | ✅ Yes | ❌ No |
| **Map** | ❌ No (Keys) ✅ Yes (Values) | ❌ No (except `LinkedHashMap`) | ✅ `TreeMap` |

This repo covers the **Java Collection Framework** with its types and methods. 🚀

