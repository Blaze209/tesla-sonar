package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.c;
import ezvcard.util.UtcOffset;
import ezvcard.util.i;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import xj0.d;

/* JADX INFO: loaded from: classes8.dex */
public class Timezone extends VCardProperty implements HasAltId {
    private UtcOffset offset;
    private String text;

    public Timezone(String str) {
        this(null, str);
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<d> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.offset == null && this.text == null) {
            list.add(new d(8, new Object[0]));
        }
        if (this.offset == null && vCardVersion == VCardVersion.V2_1) {
            list.add(new d(20, new Object[0]));
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
        Timezone timezone = (Timezone) obj;
        UtcOffset utcOffset = this.offset;
        if (utcOffset == null) {
            if (timezone.offset != null) {
                return false;
            }
        } else if (!utcOffset.equals(timezone.offset)) {
            return false;
        }
        String str = this.text;
        if (str == null) {
            if (timezone.text != null) {
                return false;
            }
        } else if (!str.equals(timezone.text)) {
            return false;
        }
        return true;
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.l();
    }

    public String getMediaType() {
        return this.parameters.u();
    }

    public UtcOffset getOffset() {
        return this.offset;
    }

    @Override // ezvcard.property.VCardProperty
    public List<c> getPids() {
        return super.getPids();
    }

    @Override // ezvcard.property.VCardProperty
    public Integer getPref() {
        return super.getPref();
    }

    public String getText() {
        return this.text;
    }

    public String getType() {
        return this.parameters.z();
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        UtcOffset utcOffset = this.offset;
        int iHashCode2 = (iHashCode + (utcOffset == null ? 0 : utcOffset.hashCode())) * 31;
        String str = this.text;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // ezvcard.property.HasAltId
    public void setAltId(String str) {
        this.parameters.E(str);
    }

    public void setMediaType(String str) {
        this.parameters.L(str);
    }

    public void setOffset(UtcOffset utcOffset) {
        this.offset = utcOffset;
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setType(String str) {
        this.parameters.P(str);
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("offset", this.offset);
        linkedHashMap.put("text", this.text);
        return linkedHashMap;
    }

    public TimeZone toTimeZone() {
        TimeZone timeZoneId;
        String str = this.text;
        if (str != null && (timeZoneId = i.parseTimeZoneId(str)) != null) {
            return timeZoneId;
        }
        if (this.offset == null) {
            return null;
        }
        String str2 = this.text;
        if (str2 == null) {
            str2 = "";
        }
        return new SimpleTimeZone((int) this.offset.a(), str2);
    }

    public Timezone(UtcOffset utcOffset) {
        this(utcOffset, null);
    }

    @Override // ezvcard.property.VCardProperty
    public Timezone copy() {
        return new Timezone(this);
    }

    public Timezone(UtcOffset utcOffset, String str) {
        setOffset(utcOffset);
        setText(str);
    }

    public Timezone(TimeZone timeZone) {
        this(UtcOffset.g(timeZone), timeZone.getID());
    }

    public Timezone(Timezone timezone) {
        super(timezone);
        this.offset = timezone.offset;
        this.text = timezone.text;
    }
}
