package lc;

import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import ec.g0;
import ec.h0;
import p013kotlin.Metadata;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Llc/e;", "Llc/c;", "", "Lec/g0;", "<init>", "()V", "data", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "(ILandroid/content/Context;)Z", "Lrc/n;", "options", "c", "(ILrc/n;)Lec/g0;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements c<Integer, g0> {
    private final boolean b(int data, Context context) {
        try {
            return context.getResources().getResourceEntryName(data) != null;
        } catch (Resources.NotFoundException unused) {
        }
    }

    @Override // lc.c
    public /* bridge */ /* synthetic */ g0 a(Integer num, Options options) {
        return c(num.intValue(), options);
    }

    public g0 c(int data, Options options) {
        if (!b(data, options.getContext())) {
            return null;
        }
        return h0.j("android.resource://" + options.getContext().getPackageName() + '/' + data, null, 1, null);
    }
}
