fun main(){
    val genre = "SCIENCE"
    val book = BookFactory.createBook(when(genre){
        "SCIENCE" -> Genre.SCIENCE
        else -> Genre.LITERATURE
    })
    val bookInfo = book.getInfo()
    val bookOrder = book.order()
    val bookRate = book.rate()
}

/*upload file:

If (“prod”.equals(getEnvironment())) {
2
   executeMethodA();
3
} else {
4
   executeMethodB();
5
}

try {
        fileUploadingAPI.putFileIntoStorage(uploadField.getFileId(), fd);
    } catch (FileStorageException e) {
        log.error (e.getMessage)
    }

This might be a good approach.

try {
    fileUploadingAPI.putFileIntoStorage(uploadField.getFileId(), fd);
} catch (FileStorageException e) {
    throw new RuntimeException("Error saving file to FileStorage", e);
}

 */