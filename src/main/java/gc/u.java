package gc;

import com.fourthline.adapters.serialization.OrcaKeys;
import okio.i0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0011J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0012\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lgc/u;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lokio/j;", "source", "()Lokio/j;", "Lokio/i0;", "y1", "()Lokio/i0;", "Lokio/o;", "getFileSystem", "()Lokio/o;", "fileSystem", "Lgc/u$a;", "getMetadata", "()Lgc/u$a;", OrcaKeys.METADATA, "a", "Lgc/t;", "Lgc/x;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface u extends AutoCloseable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgc/u$a;", "", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {
    }

    okio.o getFileSystem();

    a getMetadata();

    okio.j source();

    i0 y1();
}
