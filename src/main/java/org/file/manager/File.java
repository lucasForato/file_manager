package org.file.manager;

enum FileType {
    XLSX,
    CSV,
    TXT
}

public class File {
    FileType fileType = FileType.TXT;
    String name = "undefined";
    public FileType getFileType() {
        return this.fileType;
    }
    public String getName() {
        return name;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public void setName(String name) {
        this.name = name;
    }
}
