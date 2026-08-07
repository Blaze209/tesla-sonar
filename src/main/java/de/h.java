package de;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lde/h;", "", "<init>", "()V", "", "component", "", "isStoredPaymentMethod", "brand", "", "configData", "Lde/a$a;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)Lde/a$a;", "target", "c", "(Ljava/lang/String;Ljava/lang/String;)Lde/a$a;", "Lde/a$b;", "f", "(Ljava/lang/String;)Lde/a$b;", "subType", "message", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lde/a$b;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f60518a = new h();

    private h() {
    }

    public static /* synthetic */ a.Log b(h hVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        return hVar.a(str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a.Info e(h hVar, String str, Boolean bool, String str2, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bool = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            map = null;
        }
        return hVar.d(str, bool, str2, map);
    }

    public final a.Log a(String component, String subType, String message) {
        s.k(component, "component");
        s.k(subType, "subType");
        return new a.Log(null, 0L, false, component, a.Log.EnumC1234a.ACTION, subType, null, null, message, EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE, null);
    }

    public final a.Info c(String component, String target) {
        s.k(component, "component");
        s.k(target, "target");
        return new a.Info(null, 0L, false, component, a.Info.EnumC1233a.DOWNLOAD, target, null, null, null, null, null, null, 4039, null);
    }

    public final a.Info d(String component, Boolean isStoredPaymentMethod, String brand, Map<String, String> configData) {
        s.k(component, "component");
        return new a.Info(null, 0L, false, component, a.Info.EnumC1233a.RENDERED, null, isStoredPaymentMethod, brand, null, null, null, configData, 1831, null);
    }

    public final a.Log f(String component) {
        s.k(component, "component");
        return new a.Log(null, 0L, false, component, a.Log.EnumC1234a.SUBMIT, null, null, null, null, DownloaderService.STATUS_FILE_DELIVERED_INCORRECTLY, null);
    }
}
