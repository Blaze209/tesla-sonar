package expo.modules.webbrowser;

import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aJ\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0005j\b\u0012\u0004\u0012\u00028\u0001`\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0082\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"T", "R", "", "Lkotlin/Function1;", "mapper", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mapToDistinctArrayList", "(Ljava/util/Collection;Lwn0/l;)Ljava/util/ArrayList;", "Landroidx/browser/customtabs/d;", "createDefaultCustomTabsIntent", "()Landroidx/browser/customtabs/d;", "Landroid/content/Intent;", "createDefaultCustomTabsServiceIntent", "()Landroid/content/Intent;", "", "DUMMY_URL", "Ljava/lang/String;", "expo-web-browser_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CustomTabsActivitiesHelperKt {
    private static final String DUMMY_URL = "https://expo.dev";

    /* JADX INFO: Access modifiers changed from: private */
    public static final d createDefaultCustomTabsIntent() {
        d dVarB = new d.C0067d().b();
        s.j(dVarB, "build(...)");
        dVarB.f2960a.setData(Uri.parse(DUMMY_URL));
        return dVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent createDefaultCustomTabsServiceIntent() {
        Intent intent = new Intent();
        intent.setAction("android.support.customtabs.action.CustomTabsService");
        return intent;
    }

    private static final <T, R> ArrayList<R> mapToDistinctArrayList(Collection<? extends T> collection, l<? super T, ? extends R> lVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(lVar.invoke(it.next()));
        }
        return new ArrayList<>(linkedHashSet);
    }
}
