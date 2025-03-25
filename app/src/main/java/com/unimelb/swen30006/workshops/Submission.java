package com.unimelb.swen30006.workshops;

// Sample private submission class to be replaced by your implementation
class Submission {
    // Return two fake files
    private int attemptNum;
    private int numFiles;
    private File[] files;

    public Submission(int attemptNum, int numFiles, File[] files) {
        this.attemptNum = attemptNum;
        this.numFiles = numFiles;
    }

    public File[] includedFiles(){
        File[] files = new File[2];
        files[0] = new File();
        files[1] = new File();
        return files;
    }

    public int getAttemptNum() {
        return attemptNum;
    }

    public int getNumFiles() {
        return numFiles;
    }

    public boolean isValid() {

        return numFiles > 0;
    }
}
