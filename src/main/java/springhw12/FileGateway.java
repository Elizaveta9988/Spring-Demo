package springhw12;
@MessagingGateway(defaultRequestChannel = "textInputChanel")
public class FileGateway {
    void writeToFile(@Header(FileHeaders.FILENAME) String filename, String data);
}
