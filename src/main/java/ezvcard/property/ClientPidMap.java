package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import xj0.c;
import xj0.d;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V4_0})
public class ClientPidMap extends VCardProperty {
    private Integer pid;
    private String uri;

    public ClientPidMap(Integer num, String str) {
        this.pid = num;
        this.uri = str;
    }

    public static ClientPidMap random(Integer num) {
        return new ClientPidMap(num, "urn:uuid:" + UUID.randomUUID().toString());
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<d> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.pid == null && this.uri == null) {
            list.add(new d(8, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        ClientPidMap clientPidMap = (ClientPidMap) obj;
        Integer num = this.pid;
        if (num == null) {
            if (clientPidMap.pid != null) {
                return false;
            }
        } else if (!num.equals(clientPidMap.pid)) {
            return false;
        }
        String str = this.uri;
        if (str == null) {
            if (clientPidMap.uri != null) {
                return false;
            }
        } else if (!str.equals(clientPidMap.uri)) {
            return false;
        }
        return true;
    }

    public Integer getPid() {
        return this.pid;
    }

    public String getUri() {
        return this.uri;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Integer num = this.pid;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.uri;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public void setPid(Integer num) {
        this.pid = num;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pid", this.pid);
        linkedHashMap.put("uri", this.uri);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    public ClientPidMap copy() {
        return new ClientPidMap(this);
    }

    public ClientPidMap(ClientPidMap clientPidMap) {
        super(clientPidMap);
        this.pid = clientPidMap.pid;
        this.uri = clientPidMap.uri;
    }
}
