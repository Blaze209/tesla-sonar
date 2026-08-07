package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import java.util.List;
import w8.n0;

/* JADX INFO: loaded from: classes3.dex */
public class UnrecognizedInputFormatException extends ParserException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f10832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.common.collect.x<n0> f10833d;

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends n0> list) {
        super(str, null, false, 1);
        this.f10832c = uri;
        this.f10833d = com.google.common.collect.x.n(list);
    }
}
