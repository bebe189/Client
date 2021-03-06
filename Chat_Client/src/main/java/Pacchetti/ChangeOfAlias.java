package Pacchetti; 

// |   1 byte    | 2 bytes |  string   | 1 byte |  string   | 1 byte |
// | opcode (18) |    id   | old alias |    0   | new alias |	 0   |

/**
 * 18
 * @author 18868-18027-17694
 * change of alias
 */
public class ChangeOfAlias {
    private String oldAlias;
    private String newAlias;
    private byte[] senderId;

    public ChangeOfAlias( String oldAlias, String newAlias, byte[] senderId )
    {
        this.oldAlias = oldAlias;
        this.newAlias = newAlias;
        this.senderId = senderId;
    }

    /**
     * @param oldAlias the oldAlias to set
     */
    public void setOldAlias(String oldAlias) {
        this.oldAlias = oldAlias;
    }

    /**
     * @return the newAlias
     */
    public String getNewAlias() {
        return newAlias;
    }

    /**
     * @param newAlias the newAlias to set
     */
    public void setNewAlias(String newAlias) {
        this.newAlias = newAlias;
    }

    /**
     * @return the senderId
     */
    public byte[] getSenderId() {
        return senderId;
    }

    /**
     * @param senderId the senderId to set
     */
    public void setSenderId(byte[] senderId) {
        this.senderId = senderId;
    }
    
    public byte [] getCHANGEofALIAS(){



        int i = 0;
        byte[] byteOldAlias = this.oldAlias.getBytes();
        byte[] byteNewAlias = this.newAlias.getBytes();
        byte[] packet = new byte[byteOldAlias.length+byteNewAlias.length+5];

        //OPcode
        packet[i++] = 18;
        
        //private_id
        for (byte b : this.senderId) {
            packet[i++] = b;
        }
        
        //Old_Alias
        for(byte b : byteOldAlias)
        {
            packet[i++] = b;
        }
        
        //1 byte a 0
        packet[i++] = 0;
        
        //New_Alias
        for(byte b : byteNewAlias)
        {
            packet[i++] = b;
        }
        
        //1 byte a 0
        packet[i++] = 0;
        
        return packet;
    }

}
