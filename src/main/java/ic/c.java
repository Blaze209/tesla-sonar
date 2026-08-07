package ic;

import ec.r;
import gc.v;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lic/c;", "Lic/j;", "", "byteArray", "Lrc/n;", "options", "<init>", "([BLrc/n;)V", "Lic/i;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "[B", "b", "Lrc/n;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final byte[] byteArray;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lic/c$a;", "Lic/j$a;", "", "<init>", "()V", "data", "Lrc/n;", "options", "Lec/r;", "imageLoader", "Lic/j;", "b", "([BLrc/n;Lec/r;)Lic/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j.a<byte[]> {
        @Override // ic.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(byte[] data, Options options, r imageLoader) {
            return new c(data, options);
        }
    }

    public c(byte[] bArr, Options options) {
        this.byteArray = bArr;
        this.options = options;
    }

    @Override // ic.j
    public Object a(Continuation<? super i> continuation) {
        okio.h hVar = new okio.h();
        hVar.write(this.byteArray);
        return new SourceFetchResult(v.c(hVar, this.options.getFileSystem(), null, 4, null), null, gc.h.MEMORY);
    }
}
