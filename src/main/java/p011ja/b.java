package p011ja;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0014"}, d2 = {"Lja/b;", "", "<init>", "()V", "", "a", "I", "()I", "e", "(I)V", "enter", "b", "f", "exit", "c", "setPopEnter", "popEnter", DateTokenConverter.CONVERTER_KEY, "setPopExit", "popExit", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int enter = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int exit = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int popEnter = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int popExit = -1;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getEnter() {
        return this.enter;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getExit() {
        return this.exit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPopEnter() {
        return this.popEnter;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPopExit() {
        return this.popExit;
    }

    public final void e(int i11) {
        this.enter = i11;
    }

    public final void f(int i11) {
        this.exit = i11;
    }
}
