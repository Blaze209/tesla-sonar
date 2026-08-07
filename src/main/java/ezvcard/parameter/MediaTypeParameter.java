package ezvcard.parameter;

/* JADX INFO: loaded from: classes8.dex */
public class MediaTypeParameter extends VCardParameter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f63565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f63566c;

    public MediaTypeParameter(String str, String str2, String str3) {
        super(str);
        this.f63565b = str2;
        this.f63566c = str3;
    }

    public String d() {
        return this.f63566c;
    }

    public String e() {
        return this.f63565b;
    }

    @Override // ezvcard.parameter.VCardParameter
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        MediaTypeParameter mediaTypeParameter = (MediaTypeParameter) obj;
        String str = this.f63566c;
        if (str == null) {
            if (mediaTypeParameter.f63566c != null) {
                return false;
            }
        } else if (!str.equals(mediaTypeParameter.f63566c)) {
            return false;
        }
        String str2 = this.f63565b;
        if (str2 == null) {
            if (mediaTypeParameter.f63565b != null) {
                return false;
            }
        } else if (!str2.equals(mediaTypeParameter.f63565b)) {
            return false;
        }
        return true;
    }

    @Override // ezvcard.parameter.VCardParameter
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f63566c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f63565b;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
