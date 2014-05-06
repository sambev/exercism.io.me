object Hamming {
    def compute(strand1: String, strand2: String): Int = {
        var count = 0
        strand1.zip(strand2).foreach(char => {
            if (char._1 != char._2) {
                count += 1
            }
        })
        count
    }
}
