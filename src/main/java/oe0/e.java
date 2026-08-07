package oe0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\rH¦@¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0007\u001a\u00020\u0004H¦@¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012H¦@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bH¦@¢\u0006\u0004\b&\u0010%¨\u0006'"}, d2 = {"Loe0/e;", "", "", "appWidgetId", "", IntegerTokenConverter.CONVERTER_KEY, "(I)Ljava/lang/String;", "vin", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(ILjava/lang/String;)V", "f", "(I)V", "", "c", "()Z", "b", "()I", "", "Lne0/c;", "g", "(Ljava/lang/String;)Ljava/util/List;", "", "appWidgetIds", "j", "(Ljava/lang/String;[I)I", "Lxc0/b;", "bleStatus", "a", "(Ljava/lang/String;Lxc0/b;)V", "withCache", "Lxc0/a;", "h", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface e {
    void a(String vin, xc0.b bleStatus);

    int b();

    boolean c();

    void d(int appWidgetId, String vin);

    Object e(Continuation<? super List<xc0.a>> continuation);

    void f(int appWidgetId);

    List<ne0.c> g(String vin);

    Object h(String str, boolean z11, Continuation<? super xc0.a> continuation);

    String i(int appWidgetId);

    int j(String vin, int[] appWidgetIds);

    Object k(Continuation<? super h0> continuation);

    Object l(String str, Continuation<? super xc0.a> continuation);
}
