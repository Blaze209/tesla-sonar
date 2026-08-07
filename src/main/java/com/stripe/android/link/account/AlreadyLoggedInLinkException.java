package com.stripe.android.link.account;

import com.google.android.gms.common.Scopes;
import com.stripe.android.core.exception.StripeException;
import g60.a;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/link/account/AlreadyLoggedInLinkException;", "Lcom/stripe/android/core/exception/StripeException;", "", Scopes.EMAIL, "Lg60/a;", "accountStatus", "<init>", "(Ljava/lang/String;Lg60/a;)V", "a", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/String;", "getEmail", "g", "Lg60/a;", "getAccountStatus", "()Lg60/a;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AlreadyLoggedInLinkException extends StripeException {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final a accountStatus;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlreadyLoggedInLinkException(String str, a accountStatus) {
        super(null, null, 0, null, null, 31, null);
        s.k(accountStatus, "accountStatus");
        this.email = str;
        this.accountStatus = accountStatus;
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String a() {
        return "alreadyLoggedIntoLinkError";
    }

    @Override // com.stripe.android.core.exception.StripeException
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlreadyLoggedInLinkException)) {
            return false;
        }
        AlreadyLoggedInLinkException alreadyLoggedInLinkException = (AlreadyLoggedInLinkException) other;
        return s.f(this.email, alreadyLoggedInLinkException.email) && this.accountStatus == alreadyLoggedInLinkException.accountStatus;
    }

    @Override // com.stripe.android.core.exception.StripeException
    public int hashCode() {
        String str = this.email;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.accountStatus.hashCode();
    }

    @Override // com.stripe.android.core.exception.StripeException, java.lang.Throwable
    public String toString() {
        return "AlreadyLoggedInLinkException(email=" + this.email + ", accountStatus=" + this.accountStatus + ")";
    }
}
