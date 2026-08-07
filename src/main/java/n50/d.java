package n50;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import to0.f;
import to0.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Ln50/d;", "Lro0/d;", "", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Ljava/lang/String;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Ljava/lang/String;", "Lto0/f;", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d implements ro0.d<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f93345a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final f descriptor = m.c("MarkdownToHtml", to0.e.i.f114883a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f93347c = 8;

    private d() {
    }

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String deserialize(uo0.e decoder) {
        s.k(decoder, "decoder");
        return z50.m.f127010a.a(decoder.r());
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, String value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        encoder.q(value);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public f getDescriptor() {
        return descriptor;
    }
}
