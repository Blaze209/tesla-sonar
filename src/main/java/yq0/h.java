package yq0;

import com.plaid.internal.EnumC4419g;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes10.dex */
public class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f125737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f125738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f125739c;

    protected h() {
    }

    private static synchronized String a(Date date) {
        return new SimpleDateFormat("yyMMdd").format(date);
    }

    @Override // yq0.i
    public String G2() {
        return this.f125737a;
    }

    @Override // yq0.i
    public String M2() {
        return this.f125739c;
    }

    @Override // yq0.i
    public String c0() {
        return this.f125738b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        return this.f125737a.equals(hVar.f125737a) && this.f125738b.equals(hVar.f125738b) && this.f125739c.equals(hVar.f125739c);
    }

    @Override // yq0.g
    public byte[] getKey() {
        try {
            return o.c(this.f125737a, this.f125738b, this.f125739c, "SHA-1", true);
        } catch (GeneralSecurityException e11) {
            throw new IllegalArgumentException("Unexpected exception", e11);
        }
    }

    public int hashCode() {
        String str = this.f125737a;
        int iHashCode = (EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE + (str == null ? 0 : str.hashCode())) * 61;
        String str2 = this.f125738b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 61;
        String str3 = this.f125739c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return this.f125737a + ", " + this.f125738b + ", " + this.f125739c;
    }

    public h(String str, Date date, Date date2) {
        this(str, a(date), a(date2));
    }

    public h(String str, String str2, String str3) {
        if (str == null) {
            throw new IllegalArgumentException("Illegal document number");
        }
        if (str2 == null || str2.length() != 6) {
            throw new IllegalArgumentException("Illegal date: " + str2);
        }
        if (str3 == null || str3.length() != 6) {
            throw new IllegalArgumentException("Illegal date: " + str3);
        }
        StringBuilder sb2 = new StringBuilder(str);
        while (sb2.length() < 9) {
            sb2.append('<');
        }
        this.f125737a = sb2.toString().trim();
        this.f125738b = str2;
        this.f125739c = str3;
    }
}
