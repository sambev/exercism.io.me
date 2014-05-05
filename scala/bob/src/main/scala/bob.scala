class Bob {
    def hey(statement:String):String = {
      def isSilence(str:String): String =
        str.forall(_.isWhitespace)

      def isQuestion(str:String): String =
        str endsWith "?"

      def isYelling(str: String): String =
        str == str.toUpperCase && str.exists(_.isLetter)

      if (isSilence(statement)) {
        "Fine. Be that way!"
      } else if (isYelling(statement)) {
        "Woah, chill out!"
      } else if (isQuestion(statement)) {
        "Sure."
      } else {
        "Whatever."
      }
    }
}