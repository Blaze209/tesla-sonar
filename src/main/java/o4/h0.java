package o4;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lo4/h0;", "Lo4/z0;", "", "mask", "<init>", "(C)V", "Li4/d;", "text", "Lo4/x0;", "filter", "(Li4/d;)Lo4/x0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "C", "getMask", "()C", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final char mask;

    public h0(char c11) {
        this.mask = c11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof h0) && this.mask == ((h0) other).mask;
    }

    @Override // o4.z0
    public TransformedText filter(i4.d text) {
        return new TransformedText(new i4.d(p013kotlin.text.t.R(String.valueOf(this.mask), text.getText().length()), null, null, 6, null), f0.INSTANCE.a());
    }

    public int hashCode() {
        return Character.hashCode(this.mask);
    }

    public /* synthetic */ h0(char c11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? (char) 8226 : c11);
    }
}
