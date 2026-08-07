package expo.modules.kotlin.activityresult;

import ezvcard.property.Gender;
import java.io.Serializable;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;", "Ljava/io/Serializable;", "I", Gender.OTHER, "", "input", "result", "Ljn0/h0;", "onActivityResult", "(Ljava/io/Serializable;Ljava/lang/Object;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AppContextActivityResultFallbackCallback<I extends Serializable, O> {
    void onActivityResult(I input, O result);
}
