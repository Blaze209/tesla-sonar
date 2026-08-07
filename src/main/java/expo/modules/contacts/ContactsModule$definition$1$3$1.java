package expo.modules.contacts;

import expo.modules.kotlin.Promise;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "expo.modules.contacts.ContactsModule$definition$1$3$1", f = "ContactsModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class ContactsModule$definition$1$3$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ ContactQuery $options;
    final /* synthetic */ Promise $promise;
    int label;
    final /* synthetic */ ContactsModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactsModule$definition$1$3$1(ContactQuery contactQuery, Promise promise, ContactsModule contactsModule, Continuation<? super ContactsModule$definition$1$3$1> continuation) {
        super(2, continuation);
        this.$options = contactQuery;
        this.$promise = promise;
        this.this$0 = contactsModule;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new ContactsModule$definition$1$3$1(this.$options, this.$promise, this.this$0, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ContactPage allContactsAsync;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        List<String> id2 = this.$options.getId();
        if (id2 != null && !id2.isEmpty()) {
            List<String> id3 = this.$options.getId();
            ContactsModule contactsModule = this.this$0;
            ContactQuery contactQuery = this.$options;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = id3.iterator();
            while (it.hasNext()) {
                Contact contactById = contactsModule.getContactById((String) it.next(), contactQuery.getFields());
                if (contactById != null) {
                    arrayList.add(contactById);
                }
            }
            this.$promise.resolve(ContactsModuleKt.toBundle(new ContactPage(arrayList, false, false, 0, 14, null), this.$options.getFields()));
            return h0.f84049a;
        }
        String name = this.$options.getName();
        if (name == null || p013kotlin.text.t.y0(name)) {
            allContactsAsync = this.this$0.getAllContactsAsync(this.$options);
        } else {
            allContactsAsync = this.this$0.getContactByName("%" + name + "%", this.$options.getFields(), this.$options.getSort());
        }
        this.$promise.resolve(ContactsModuleKt.toBundle(allContactsAsync, this.$options.getFields()));
        return h0.f84049a;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((ContactsModule$definition$1$3$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
