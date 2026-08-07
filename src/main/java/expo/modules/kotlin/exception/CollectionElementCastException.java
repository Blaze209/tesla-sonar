package expo.modules.kotlin.exception;

import co0.d;
import co0.q;
import com.facebook.react.bridge.ReadableType;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u000b\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\fB-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/kotlin/exception/CollectionElementCastException;", "Lexpo/modules/kotlin/exception/DecoratedException;", "Lco0/q;", "collectionType", "elementType", "", "providedType", "Lexpo/modules/kotlin/exception/CodedException;", "cause", "<init>", "(Lco0/q;Lco0/q;Ljava/lang/String;Lexpo/modules/kotlin/exception/CodedException;)V", "Lcom/facebook/react/bridge/ReadableType;", "(Lco0/q;Lco0/q;Lcom/facebook/react/bridge/ReadableType;Lexpo/modules/kotlin/exception/CodedException;)V", "Lco0/d;", "(Lco0/q;Lco0/q;Lco0/d;Lexpo/modules/kotlin/exception/CodedException;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CollectionElementCastException extends DecoratedException {
    private CollectionElementCastException(q qVar, q qVar2, String str, CodedException codedException) {
        super("Cannot cast '" + str + "' to '" + qVar2 + "' required by the collection of type: '" + qVar + "'.", codedException);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionElementCastException(q collectionType, q elementType, ReadableType providedType, CodedException cause) {
        this(collectionType, elementType, providedType.name(), cause);
        s.k(collectionType, "collectionType");
        s.k(elementType, "elementType");
        s.k(providedType, "providedType");
        s.k(cause, "cause");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionElementCastException(q collectionType, q elementType, d<?> providedType, CodedException cause) {
        this(collectionType, elementType, providedType.toString(), cause);
        s.k(collectionType, "collectionType");
        s.k(elementType, "elementType");
        s.k(providedType, "providedType");
        s.k(cause, "cause");
    }
}
