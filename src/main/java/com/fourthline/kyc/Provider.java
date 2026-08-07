package com.fourthline.kyc;

import com.fourthline.core.Validatable;
import java.util.ArrayList;
import java.util.List;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u001fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001c\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Lcom/fourthline/kyc/Provider;", "Lcom/fourthline/core/Validatable;", "Lcom/fourthline/kyc/ProviderValidationError;", "", "name", "clientNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "b", "()Z", "a", "", "validate", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/kyc/Provider;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "getClientNumber", "setClientNumber", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Provider implements Validatable<ProviderValidationError> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String clientNumber;

    /* JADX WARN: Multi-variable type inference failed */
    public Provider() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final boolean a() {
        String str = this.clientNumber;
        if (str != null) {
            return !t.y0(str);
        }
        return false;
    }

    private final boolean b() {
        String str = this.name;
        if (str != null) {
            return !t.y0(str);
        }
        return false;
    }

    public static /* synthetic */ Provider copy$default(Provider provider, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = provider.name;
        }
        if ((i11 & 2) != 0) {
            str2 = provider.clientNumber;
        }
        return provider.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientNumber() {
        return this.clientNumber;
    }

    public final Provider copy(String name, String clientNumber) {
        return new Provider(name, clientNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Provider)) {
            return false;
        }
        Provider provider = (Provider) other;
        return s.f(this.name, provider.name) && s.f(this.clientNumber, provider.clientNumber);
    }

    public final String getClientNumber() {
        return this.clientNumber;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientNumber;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setClientNumber(String str) {
        this.clientNumber = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "Provider(name=" + this.name + ", clientNumber=" + this.clientNumber + ")";
    }

    @Override // com.fourthline.core.Validatable
    public List<ProviderValidationError> validate() {
        ArrayList arrayList = new ArrayList();
        if (!b()) {
            arrayList.add(ProviderValidationError.INVALID_NAME);
        }
        if (!a()) {
            arrayList.add(ProviderValidationError.INVALID_CLIENT_NUMBER);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Provider(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public Provider(String str, String str2) {
        this.name = str;
        this.clientNumber = str2;
    }

    public /* synthetic */ Provider(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
