package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.c;
import ezvcard.util.GeoUri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xj0.d;

/* JADX INFO: loaded from: classes8.dex */
public class Geo extends VCardProperty implements HasAltId {
    private GeoUri uri;

    public Geo(Double d11, Double d12) {
        this(new GeoUri.b(d11, d12).l());
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<d> list, VCardVersion vCardVersion, VCard vCard) {
        if (getLatitude() == null) {
            list.add(new d(13, new Object[0]));
        }
        if (getLongitude() == null) {
            list.add(new d(14, new Object[0]));
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
        Geo geo = (Geo) obj;
        GeoUri geoUri = this.uri;
        if (geoUri == null) {
            if (geo.uri != null) {
                return false;
            }
        } else if (!geoUri.equals(geo.uri)) {
            return false;
        }
        return true;
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.l();
    }

    public GeoUri getGeoUri() {
        return this.uri;
    }

    public Double getLatitude() {
        GeoUri geoUri = this.uri;
        if (geoUri == null) {
            return null;
        }
        return geoUri.j();
    }

    public Double getLongitude() {
        GeoUri geoUri = this.uri;
        if (geoUri == null) {
            return null;
        }
        return geoUri.k();
    }

    public String getMediaType() {
        return this.parameters.u();
    }

    @Override // ezvcard.property.VCardProperty
    public List<c> getPids() {
        return super.getPids();
    }

    @Override // ezvcard.property.VCardProperty
    public Integer getPref() {
        return super.getPref();
    }

    public String getType() {
        return this.parameters.z();
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        GeoUri geoUri = this.uri;
        return iHashCode + (geoUri == null ? 0 : geoUri.hashCode());
    }

    @Override // ezvcard.property.HasAltId
    public void setAltId(String str) {
        this.parameters.E(str);
    }

    public void setGeoUri(GeoUri geoUri) {
        this.uri = geoUri;
    }

    public void setLatitude(Double d11) {
        GeoUri geoUri = this.uri;
        if (geoUri == null) {
            this.uri = new GeoUri.b(d11, null).l();
        } else {
            this.uri = new GeoUri.b(geoUri).m(d11).l();
        }
    }

    public void setLongitude(Double d11) {
        GeoUri geoUri = this.uri;
        if (geoUri == null) {
            this.uri = new GeoUri.b(null, d11).l();
        } else {
            this.uri = new GeoUri.b(geoUri).n(d11).l();
        }
    }

    public void setMediaType(String str) {
        this.parameters.L(str);
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
    }

    public void setType(String str) {
        this.parameters.P(str);
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("uri", this.uri);
        return linkedHashMap;
    }

    public Geo(GeoUri geoUri) {
        this.uri = geoUri;
    }

    @Override // ezvcard.property.VCardProperty
    public Geo copy() {
        return new Geo(this);
    }

    public Geo(Geo geo) {
        super(geo);
        this.uri = geo.uri;
    }
}
