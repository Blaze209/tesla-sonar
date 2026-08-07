package ii;

import ii.v.a;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0011J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lii/v;", "Lii/v$a;", "D", "Lii/p;", "", "b", "()Ljava/lang/String;", "name", "id", "Lii/b;", "adapter", "()Lii/b;", "Lmi/g;", "writer", "Lii/k;", "customScalarAdapters", "Ljn0/h0;", "a", "(Lmi/g;Lii/k;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface v<D extends a> extends p<D> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lii/v$a;", "", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface a {
    }

    @Override // ii.p
    void a(mi.g writer, k customScalarAdapters);

    b<D> adapter();

    String b();

    String id();

    String name();
}
