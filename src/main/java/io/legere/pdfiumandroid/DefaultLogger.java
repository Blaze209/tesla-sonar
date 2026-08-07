package io.legere.pdfiumandroid;

import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/legere/pdfiumandroid/DefaultLogger;", "Lio/legere/pdfiumandroid/LoggerInterface;", "<init>", "()V", "", "tag", "message", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)V", "", "t", "e", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DefaultLogger implements LoggerInterface {
    @Override // io.legere.pdfiumandroid.LoggerInterface
    public void d(String tag, String message) {
        s.k(tag, "tag");
        if (message != null) {
            Log.d(tag, message);
        }
    }

    @Override // io.legere.pdfiumandroid.LoggerInterface
    public void e(String tag, Throwable t11, String message) {
        s.k(tag, "tag");
        Log.e(tag, message, t11);
    }
}
