package expo.modules.kotlin.events;

import android.view.View;
import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.records.Record;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u0007\u0010\nJ)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000bH&¢\u0006\u0004\b\u0007\u0010\fJ5\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0007\u0010\u0011J5\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lexpo/modules/kotlin/events/EventEmitter;", "Lexpo/modules/core/interfaces/services/EventEmitter;", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "eventBody", "Ljn0/h0;", "emit", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lexpo/modules/kotlin/records/Record;", "(Ljava/lang/String;Lexpo/modules/kotlin/records/Record;)V", "", "(Ljava/lang/String;Ljava/util/Map;)V", "", "viewId", "", "coalescingKey", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;Ljava/lang/Short;)V", "Landroid/view/View;", "view", "(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;Ljava/lang/Short;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EventEmitter extends expo.modules.core.interfaces.services.EventEmitter {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void emit$default(EventEmitter eventEmitter, int i11, String str, WritableMap writableMap, Short sh2, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: emit");
            }
            if ((i12 & 8) != 0) {
                sh2 = null;
            }
            eventEmitter.emit(i11, str, writableMap, sh2);
        }

        public static /* synthetic */ void emit$default(EventEmitter eventEmitter, View view, String str, WritableMap writableMap, Short sh2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: emit");
            }
            if ((i11 & 8) != 0) {
                sh2 = null;
            }
            eventEmitter.emit(view, str, writableMap, sh2);
        }
    }

    void emit(int viewId, String eventName, WritableMap eventBody, Short coalescingKey);

    void emit(View view, String eventName, WritableMap eventBody, Short coalescingKey);

    void emit(String eventName, WritableMap eventBody);

    void emit(String eventName, Record eventBody);

    void emit(String eventName, Map<?, ?> eventBody);
}
