package ezvcard.property;

import com.google.android.gms.common.internal.ImagesContract;
import ezvcard.VCard;
import ezvcard.VCardVersion;
import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xj0.c;
import xj0.d;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V2_1, VCardVersion.V3_0})
public class Agent extends VCardProperty {
    private String url;
    private VCard vcard;

    public Agent() {
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<d> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.url == null && this.vcard == null) {
            list.add(new d(8, new Object[0]));
        }
        if (this.vcard != null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setMinimumIntegerDigits(2);
            for (Map.Entry<VCardProperty, List<d>> entry : this.vcard.q(vCardVersion)) {
                VCardProperty key = entry.getKey();
                for (d dVar : entry.getValue()) {
                    String str = "";
                    String simpleName = key == null ? "" : key.getClass().getSimpleName();
                    int iIntValue = dVar.a().intValue();
                    if (iIntValue >= 0) {
                        str = "W" + integerInstance.format(iIntValue);
                    }
                    list.add(new d(10, simpleName, str, dVar.b()));
                }
            }
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
        Agent agent = (Agent) obj;
        String str = this.url;
        if (str == null) {
            if (agent.url != null) {
                return false;
            }
        } else if (!str.equals(agent.url)) {
            return false;
        }
        VCard vCard = this.vcard;
        if (vCard == null) {
            if (agent.vcard != null) {
                return false;
            }
        } else if (!vCard.equals(agent.vcard)) {
            return false;
        }
        return true;
    }

    public String getUrl() {
        return this.url;
    }

    public VCard getVCard() {
        return this.vcard;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        VCard vCard = this.vcard;
        return iHashCode2 + (vCard != null ? vCard.hashCode() : 0);
    }

    public void setUrl(String str) {
        this.url = str;
        this.vcard = null;
    }

    public void setVCard(VCard vCard) {
        this.vcard = vCard;
        this.url = null;
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ImagesContract.URL, this.url);
        linkedHashMap.put("vcard", this.vcard);
        return linkedHashMap;
    }

    public Agent(String str) {
        setUrl(str);
    }

    @Override // ezvcard.property.VCardProperty
    public Agent copy() {
        return new Agent(this);
    }

    public Agent(VCard vCard) {
        setVCard(vCard);
    }

    public Agent(Agent agent) {
        super(agent);
        this.url = agent.url;
        VCard vCard = agent.vcard;
        this.vcard = vCard == null ? null : new VCard(vCard);
    }
}
