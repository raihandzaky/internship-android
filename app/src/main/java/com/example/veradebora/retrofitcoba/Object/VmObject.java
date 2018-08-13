package com.example.veradebora.retrofitcoba.Object;

/**
 * Created by Vera Debora on 8/2/2018.
 */

public class VmObject {
    private String HostName;
    private String Status;
    private String Os;

    public String getHostName() {
        return HostName;
    }

    public void setHostName(String hostName) {
        HostName = hostName;
    }

    public String getStatus() {
        switch (Status){
            case "1":
                return "Waiting For Approval";
            case "2":
                return "Running";
            case "4":
                return "Deleted";
        }
        return null;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getOs() {
        switch (Os){
            case "75a86ebb-ed04-4f13-a9d5-daa5cd8acec2":
                return "Debian 8 x64";
            case "665ee283-f781-4f39-b145-ceae23bcf8b1":
                return "CentOS 7 x64";
            case "eef9d93d-c05c-45de-85c4-05561d9b959b":
                return "Ubuntu 16.04.2 x64";
        }
        return null;
    }

    public void setOs(String os) {
    Os = os;
    }

    public VmObject(String hostName, String status, String os) {
        HostName = hostName;
        Status = status;
        Os = os;

    }
}
