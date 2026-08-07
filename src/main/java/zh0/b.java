package zh0;

import android.os.Bundle;
import android.os.Parcelable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0000*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzh0/a;", "Landroid/os/Parcelable;", "args", "a", "(Lzh0/a;Landroid/os/Parcelable;)Lzh0/a;", "shared_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final a<?> a(a<?> aVar, Parcelable args) {
        s.k(aVar, "<this>");
        s.k(args, "args");
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARGUMENT_ARGS", args);
        aVar.setArguments(bundle);
        return aVar;
    }
}
