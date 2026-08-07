package yh0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u00013B[\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0093\u0001\u0010\u001e\u001a\u00020\u001a\"\b\b\u0001\u0010\u000f*\u00028\u0000\"\b\b\u0002\u0010\u0011*\u00020\u00102\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u00122\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u00152\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00152\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\n¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b'\u0010(J9\u0010/\u001a\u00020\u001a2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030+2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010-¢\u0006\u0004\b/\u00100R&\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R(\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u001c\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010;\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00018\u00008\u0000078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R*\u0010C\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR&\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000)8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010O\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lyh0/e;", "", "T", "Lkotlin/Function2;", "", "areItemsTheSame", "areContentsTheSame", "getChangePayload", "<init>", "(Lwn0/p;Lwn0/p;Lwn0/p;)V", "", "position", "Lyh0/e$b;", "n", "(I)Lyh0/e$b;", "R", "Lgb/a;", "VB", "Lco0/d;", "clazz", "viewBindingClass", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "inflateFn", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Ljn0/h0;", "bindViewHolder", "Lkotlin/Function1;", "onViewCreated", "j", "(Lco0/d;Lco0/d;Lwn0/q;Lwn0/q;Lwn0/l;)V", "o", "(I)I", "parent", "viewType", "r", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$g0;", "holder", "q", "(Landroidx/recyclerview/widget/RecyclerView$g0;I)V", "", "newItems", "Landroidx/recyclerview/widget/RecyclerView$h;", "adapter", "Lkotlin/Function0;", "cb", "s", "(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView$h;Lwn0/a;)V", "a", "Lwn0/p;", "b", "c", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/d;", "kotlin.jvm.PlatformType", "e", "Landroidx/recyclerview/widget/d;", "differ", "", "f", "Ljava/util/List;", "itemInfos", "", "g", "Ljava/util/Map;", "itemInfoByItemType", "h", "itemInfoByViewType", "Lyh0/d0;", IntegerTokenConverter.CONVERTER_KEY, "Lyh0/d0;", "viewTypeGenerator", "p", "()Ljava/util/List;", "items", "m", "()I", "itemCount", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<T, T, Boolean> areItemsTheSame;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<T, T, Boolean> areContentsTheSame;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<T, T, Object> getChangePayload;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private RecyclerView.h<?> adapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final androidx.recyclerview.widget.d<T> differ;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<ItemInfo<T>> itemInfos;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<co0.d<?>, ItemInfo<T>> itemInfoByItemType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, ItemInfo<T>> itemInfoByViewType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final d0 viewTypeGenerator;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f125500a = new a();

        a() {
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(T old, T t11) {
            p013kotlin.jvm.internal.s.k(old, "old");
            p013kotlin.jvm.internal.s.k(t11, "new");
            return null;
        }
    }

    /* JADX INFO: renamed from: yh0.e$b, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\b\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\b\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018R\u001f\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R/\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R/\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b\u001c\u0010%R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b#\u0010(¨\u0006)"}, d2 = {"Lyh0/e$b;", "T", "", "", "viewType", "Lco0/d;", "Lgb/a;", "viewBindingClass", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "inflateFn", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Ljn0/h0;", "bindViewHolder", "Lkotlin/Function1;", "onViewCreated", "<init>", "(ILco0/d;Lwn0/q;Lwn0/q;Lwn0/l;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", DateTokenConverter.CONVERTER_KEY, "b", "Lco0/d;", "getViewBindingClass", "()Lco0/d;", "c", "Lwn0/q;", "()Lwn0/q;", "e", "Lwn0/l;", "()Lwn0/l;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemInfo<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int viewType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final co0.d<? extends gb.a> viewBindingClass;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn0.q<LayoutInflater, ViewGroup, Boolean, gb.a> inflateFn;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn0.q<T, gb.a, RecyclerView.g0, h0> bindViewHolder;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn0.l<gb.a, h0> onViewCreated;

        /* JADX WARN: Multi-variable type inference failed */
        public ItemInfo(int i11, co0.d<? extends gb.a> viewBindingClass, wn0.q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends gb.a> inflateFn, wn0.q<? super T, ? super gb.a, ? super RecyclerView.g0, h0> bindViewHolder, wn0.l<? super gb.a, h0> lVar) {
            p013kotlin.jvm.internal.s.k(viewBindingClass, "viewBindingClass");
            p013kotlin.jvm.internal.s.k(inflateFn, "inflateFn");
            p013kotlin.jvm.internal.s.k(bindViewHolder, "bindViewHolder");
            this.viewType = i11;
            this.viewBindingClass = viewBindingClass;
            this.inflateFn = inflateFn;
            this.bindViewHolder = bindViewHolder;
            this.onViewCreated = lVar;
        }

        public final wn0.q<T, gb.a, RecyclerView.g0, h0> a() {
            return this.bindViewHolder;
        }

        public final wn0.q<LayoutInflater, ViewGroup, Boolean, gb.a> b() {
            return this.inflateFn;
        }

        public final wn0.l<gb.a, h0> c() {
            return this.onViewCreated;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getViewType() {
            return this.viewType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemInfo)) {
                return false;
            }
            ItemInfo itemInfo = (ItemInfo) other;
            return this.viewType == itemInfo.viewType && p013kotlin.jvm.internal.s.f(this.viewBindingClass, itemInfo.viewBindingClass) && p013kotlin.jvm.internal.s.f(this.inflateFn, itemInfo.inflateFn) && p013kotlin.jvm.internal.s.f(this.bindViewHolder, itemInfo.bindViewHolder) && p013kotlin.jvm.internal.s.f(this.onViewCreated, itemInfo.onViewCreated);
        }

        public int hashCode() {
            int iHashCode = ((((((Integer.hashCode(this.viewType) * 31) + this.viewBindingClass.hashCode()) * 31) + this.inflateFn.hashCode()) * 31) + this.bindViewHolder.hashCode()) * 31;
            wn0.l<gb.a, h0> lVar = this.onViewCreated;
            return iHashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        public String toString() {
            return "ItemInfo(viewType=" + this.viewType + ", viewBindingClass=" + this.viewBindingClass + ", inflateFn=" + this.inflateFn + ", bindViewHolder=" + this.bindViewHolder + ", onViewCreated=" + this.onViewCreated + ")";
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J)\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"yh0/e$c", "Landroidx/recyclerview/widget/r;", "", "position", "count", "Ljn0/h0;", "b", "(II)V", "c", "fromPosition", "toPosition", DateTokenConverter.CONVERTER_KEY, "", StatusResponse.PAYLOAD, "a", "(IILjava/lang/Object;)V", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements androidx.recyclerview.widget.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e<T> f125506a;

        c(e<T> eVar) {
            this.f125506a = eVar;
        }

        @Override // androidx.recyclerview.widget.r
        public void a(int position, int count, Object payload) {
            RecyclerView.h hVar = ((e) this.f125506a).adapter;
            if (hVar != null) {
                hVar.notifyItemRangeChanged(position, count, payload);
            }
        }

        @Override // androidx.recyclerview.widget.r
        public void b(int position, int count) {
            RecyclerView.h hVar = ((e) this.f125506a).adapter;
            if (hVar != null) {
                hVar.notifyItemRangeInserted(position, count);
            }
        }

        @Override // androidx.recyclerview.widget.r
        public void c(int position, int count) {
            RecyclerView.h hVar = ((e) this.f125506a).adapter;
            if (hVar != null) {
                hVar.notifyItemRangeRemoved(position, count);
            }
        }

        @Override // androidx.recyclerview.widget.r
        public void d(int fromPosition, int toPosition) {
            RecyclerView.h hVar = ((e) this.f125506a).adapter;
            if (hVar != null) {
                hVar.notifyItemMoved(fromPosition, toPosition);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"yh0/e$d", "Landroidx/recyclerview/widget/h$f;", "oldItem", "newItem", "", "areItemsTheSame", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "areContentsTheSame", "", "getChangePayload", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends androidx.recyclerview.widget.h.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e<T> f125507a;

        d(e<T> eVar) {
            this.f125507a = eVar;
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(T oldItem, T newItem) {
            p013kotlin.jvm.internal.s.k(oldItem, "oldItem");
            p013kotlin.jvm.internal.s.k(newItem, "newItem");
            return ((Boolean) ((e) this.f125507a).areContentsTheSame.invoke(oldItem, newItem)).booleanValue();
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(T oldItem, T newItem) {
            p013kotlin.jvm.internal.s.k(oldItem, "oldItem");
            p013kotlin.jvm.internal.s.k(newItem, "newItem");
            return ((Boolean) ((e) this.f125507a).areItemsTheSame.invoke(oldItem, newItem)).booleanValue();
        }

        @Override // androidx.recyclerview.widget.h.f
        public Object getChangePayload(T oldItem, T newItem) {
            p013kotlin.jvm.internal.s.k(oldItem, "oldItem");
            p013kotlin.jvm.internal.s.k(newItem, "newItem");
            return ((e) this.f125507a).getChangePayload.invoke(oldItem, newItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(wn0.p<? super T, ? super T, Boolean> areItemsTheSame, wn0.p<? super T, ? super T, Boolean> areContentsTheSame, wn0.p<? super T, ? super T, ? extends Object> getChangePayload) {
        p013kotlin.jvm.internal.s.k(areItemsTheSame, "areItemsTheSame");
        p013kotlin.jvm.internal.s.k(areContentsTheSame, "areContentsTheSame");
        p013kotlin.jvm.internal.s.k(getChangePayload, "getChangePayload");
        this.areItemsTheSame = areItemsTheSame;
        this.areContentsTheSame = areContentsTheSame;
        this.getChangePayload = getChangePayload;
        this.differ = new androidx.recyclerview.widget.d<>(new c(this), new androidx.recyclerview.widget.c.a(new d(this)).a());
        this.itemInfos = new ArrayList();
        this.itemInfoByItemType = new LinkedHashMap();
        this.itemInfoByViewType = new LinkedHashMap();
        this.viewTypeGenerator = e0.f125508a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(Object oldItem, Object newItem) {
        p013kotlin.jvm.internal.s.k(oldItem, "oldItem");
        p013kotlin.jvm.internal.s.k(newItem, "newItem");
        return p013kotlin.jvm.internal.s.f(oldItem, newItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 k(wn0.q qVar, Object item, gb.a b11, RecyclerView.g0 h11) {
        p013kotlin.jvm.internal.s.k(item, "item");
        p013kotlin.jvm.internal.s.k(b11, "b");
        p013kotlin.jvm.internal.s.k(h11, "h");
        qVar.invoke(item, b11, h11);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <VB extends gb.a> h0 l(wn0.l<? super VB, h0> lVar, gb.a aVar) {
        p013kotlin.jvm.internal.s.i(aVar, "null cannot be cast to non-null type VB of com.withpersona.sdk2.inquiry.shared.AdapterHelper.addItemTypeInternal");
        lVar.invoke(aVar);
        return h0.f84049a;
    }

    private final ItemInfo<T> n(int position) {
        T t11 = p().get(position);
        ItemInfo<T> itemInfo = this.itemInfoByItemType.get(o0.b(t11.getClass()));
        if (itemInfo != null) {
            return itemInfo;
        }
        throw new IllegalArgumentException(("No item info for type '" + t11.getClass() + "'. Ensure this type is added.").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void t(e eVar, List list, RecyclerView.h hVar, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            aVar = null;
        }
        eVar.s(list, hVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(wn0.a aVar) {
        aVar.invoke();
    }

    public final <R extends T, VB extends gb.a> void j(co0.d<?> clazz, co0.d<VB> viewBindingClass, wn0.q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends gb.a> inflateFn, final wn0.q<? super R, ? super VB, ? super RecyclerView.g0, h0> bindViewHolder, final wn0.l<? super VB, h0> onViewCreated) {
        p013kotlin.jvm.internal.s.k(clazz, "clazz");
        p013kotlin.jvm.internal.s.k(viewBindingClass, "viewBindingClass");
        p013kotlin.jvm.internal.s.k(inflateFn, "inflateFn");
        p013kotlin.jvm.internal.s.k(bindViewHolder, "bindViewHolder");
        if (this.itemInfoByItemType.get(clazz) == null) {
            ItemInfo<T> itemInfo = new ItemInfo<>(this.viewTypeGenerator.a(), viewBindingClass, inflateFn, new wn0.q() { // from class: yh0.a
                @Override // wn0.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return e.k(bindViewHolder, obj, (gb.a) obj2, (RecyclerView.g0) obj3);
                }
            }, onViewCreated != null ? new wn0.l() { // from class: yh0.b
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return e.l(onViewCreated, (gb.a) obj);
                }
            } : null);
            this.itemInfos.add(itemInfo);
            this.itemInfoByItemType.put(clazz, itemInfo);
            this.itemInfoByViewType.put(Integer.valueOf(itemInfo.getViewType()), itemInfo);
            return;
        }
        throw new IllegalArgumentException(("Item type " + clazz + " has already been added.").toString());
    }

    public final int m() {
        return this.differ.b().size();
    }

    public final int o(int position) {
        return n(position).getViewType();
    }

    public final List<T> p() {
        List<T> listB = this.differ.b();
        p013kotlin.jvm.internal.s.j(listB, "getCurrentList(...)");
        return listB;
    }

    public final void q(RecyclerView.g0 holder, int position) {
        p013kotlin.jvm.internal.s.k(holder, "holder");
        ItemInfo<T> itemInfoN = n(position);
        itemInfoN.a().invoke(p().get(position), c0.a(holder), holder);
    }

    public final RecyclerView.g0 r(ViewGroup parent, int viewType) {
        ItemInfo<T> itemInfo;
        p013kotlin.jvm.internal.s.k(parent, "parent");
        if (this.itemInfos.size() == 1) {
            itemInfo = (ItemInfo) p013kotlin.collections.v.o0(this.itemInfos);
        } else {
            ItemInfo<T> itemInfo2 = this.itemInfoByViewType.get(Integer.valueOf(viewType));
            if (itemInfo2 == null) {
                throw new IllegalArgumentException(("No item for layout id '" + viewType + "'. Ensure this item is added. Maybe you forgot 'override fun getItemViewType(position: Int): Int = ...'?").toString());
            }
            itemInfo = itemInfo2;
        }
        wn0.q<LayoutInflater, ViewGroup, Boolean, gb.a> qVarB = itemInfo.b();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        p013kotlin.jvm.internal.s.j(layoutInflaterFrom, "from(...)");
        b0 b0Var = new b0(qVarB.invoke(layoutInflaterFrom, parent, Boolean.FALSE));
        wn0.l<gb.a, h0> lVarC = itemInfo.c();
        if (lVarC != null) {
            lVarC.invoke(b0Var.a());
        }
        return b0Var;
    }

    public final void s(List<? extends T> newItems, RecyclerView.h<?> adapter, final wn0.a<h0> cb2) {
        p013kotlin.jvm.internal.s.k(newItems, "newItems");
        p013kotlin.jvm.internal.s.k(adapter, "adapter");
        this.adapter = adapter;
        this.differ.f(newItems, cb2 != null ? new Runnable() { // from class: yh0.d
            @Override // java.lang.Runnable
            public final void run() {
                e.u(cb2);
            }
        } : null);
    }

    public /* synthetic */ e(wn0.p pVar, wn0.p pVar2, wn0.p pVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, (i11 & 2) != 0 ? new wn0.p() { // from class: yh0.c
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(e.e(obj, obj2));
            }
        } : pVar2, (i11 & 4) != 0 ? a.f125500a : pVar3);
    }
}
