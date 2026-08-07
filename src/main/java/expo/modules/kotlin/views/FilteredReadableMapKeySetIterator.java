package expo.modules.kotlin.views;

import com.facebook.react.bridge.ReadableMapKeySetIterator;
import expo.modules.kotlin.Filter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0010R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/kotlin/views/FilteredReadableMapKeySetIterator;", "Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "iterator", "Lexpo/modules/kotlin/Filter;", "", "filter", "<init>", "(Lcom/facebook/react/bridge/ReadableMapKeySetIterator;Lexpo/modules/kotlin/Filter;)V", "Ljn0/h0;", "findNext", "()V", "", "hasNextKey", "()Z", "nextKey", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "Lexpo/modules/kotlin/Filter;", "next", "Ljava/lang/String;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FilteredReadableMapKeySetIterator implements ReadableMapKeySetIterator {
    private final Filter<String> filter;
    private final ReadableMapKeySetIterator iterator;
    private String next;

    public FilteredReadableMapKeySetIterator(ReadableMapKeySetIterator iterator, Filter<String> filter) {
        s.k(iterator, "iterator");
        s.k(filter, "filter");
        this.iterator = iterator;
        this.filter = filter;
        findNext();
    }

    private final void findNext() {
        while (this.iterator.hasNextKey()) {
            String strNextKey = this.iterator.nextKey();
            this.next = strNextKey;
            if (this.filter.apply(strNextKey)) {
                return;
            }
        }
        this.next = null;
    }

    @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
    public boolean hasNextKey() {
        return this.next != null;
    }

    @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
    public String nextKey() {
        String str = this.next;
        s.h(str);
        findNext();
        return str;
    }
}
