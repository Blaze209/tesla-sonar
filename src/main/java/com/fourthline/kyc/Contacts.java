package com.fourthline.kyc;

import com.fourthline.core.Validatable;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0013\u0010\n\u001a\u00020\t*\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J4\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010#R$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010#R$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010#¨\u0006("}, d2 = {"Lcom/fourthline/kyc/Contacts;", "Lcom/fourthline/core/Validatable;", "Lcom/fourthline/kyc/ContactsValidationError;", "", Scopes.EMAIL, "phone", "mobile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "a", "()Z", "c", "b", "(Ljava/lang/String;)Z", "", "validate", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/kyc/Contacts;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail", "setEmail", "(Ljava/lang/String;)V", "getPhone", "setPhone", "getMobile", "setMobile", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Contacts implements Validatable<ContactsValidationError> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String email;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String phone;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String mobile;

    public Contacts() {
        this(null, null, null, 7, null);
    }

    private final boolean a() {
        String str = this.email;
        if (str == null) {
            return false;
        }
        Locale ROOT = Locale.ROOT;
        s.j(ROOT, "ROOT");
        String lowerCase = str.toLowerCase(ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        return lowerCase != null && new q("[_\\-a-zA-Z0-9.+]+@[a-zA-Z0-9](\\.?[\\-a-zA-Z0-9]*[a-zA-Z0-9])*").i(lowerCase) && lowerCase.length() <= 254;
    }

    private final boolean b() {
        String str = this.mobile;
        if (str != null) {
            return a(str);
        }
        return false;
    }

    private final boolean c() {
        String str = this.phone;
        if (str != null) {
            return a(str);
        }
        return true;
    }

    public static /* synthetic */ Contacts copy$default(Contacts contacts, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = contacts.email;
        }
        if ((i11 & 2) != 0) {
            str2 = contacts.phone;
        }
        if ((i11 & 4) != 0) {
            str3 = contacts.mobile;
        }
        return contacts.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMobile() {
        return this.mobile;
    }

    public final Contacts copy(String email, String phone, String mobile) {
        return new Contacts(email, phone, mobile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Contacts)) {
            return false;
        }
        Contacts contacts = (Contacts) other;
        return s.f(this.email, contacts.email) && s.f(this.phone, contacts.phone) && s.f(this.mobile, contacts.mobile);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        String str = this.email;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phone;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mobile;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setMobile(String str) {
        this.mobile = str;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public String toString() {
        return "Contacts(email=" + this.email + ", phone=" + this.phone + ", mobile=" + this.mobile + ")";
    }

    @Override // com.fourthline.core.Validatable
    public List<ContactsValidationError> validate() {
        ArrayList arrayList = new ArrayList();
        if (!a()) {
            arrayList.add(ContactsValidationError.INVALID_EMAIL);
        }
        if (!c()) {
            arrayList.add(ContactsValidationError.INVALID_PHONE);
        }
        if (!b()) {
            arrayList.add(ContactsValidationError.INVALID_MOBILE);
        }
        return arrayList;
    }

    public Contacts(String str) {
        this(str, null, null, 6, null);
    }

    public Contacts(String str, String str2) {
        this(str, str2, null, 4, null);
    }

    private final boolean a(String str) {
        return !t.y0(str) && new q("^\\+?[0-9 ]*$").i(str);
    }

    public Contacts(String str, String str2, String str3) {
        this.email = str;
        this.phone = str2;
        this.mobile = str3;
    }

    public /* synthetic */ Contacts(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
