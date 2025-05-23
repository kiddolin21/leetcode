class LRUCache(capacity: Int) {
    
    class Node(val key: Int, var value: Int) {
        var next: Node? = null
        var prev: Node? = null
    }

    private val capacity = capacity
    private val map = HashMap<Int, Node>()
    private val head = Node(0, 0)
    private var end = Node(0, 0)

    init {
        head.next = end
        end.prev = head
    }

    fun get(key: Int): Int {
        return map[key]?.let {
            insertToHead(it)
            it.value
        } ?: -1

    }

    fun put(key: Int, value: Int) {
        // updating value
        if (get(key) != -1) {
            map[key]?.value = value
        } else {
        // add node
            if (map.size == capacity) {
                remove(end.prev)
            }
            val node = Node(key, value)
            insertToHead(node)
            map[key] = node
        }
    }

    private fun remove(node: Node?) {
        node?.prev?.next = node?.next
        node?.next?.prev = node?.prev
        node?.let { map.remove(it.key) }
    }

    private fun insertToHead(node: Node) {
        node.prev?.next = node.next
        node.next?.prev = node.prev

        node.next = head.next
        head.next?.prev = node
        head.next = node
        node.prev = head
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * var obj = LRUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */
