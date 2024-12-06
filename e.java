public final class aadb implements Runnable {
   public final aadl a;

   // $FF: synthetic method
   public aadb(aadl view) {
      this.a = view;
   }

   public final void run() {
      aadl var4 = this.a;
      var4.e = false;
      if (var4.h()) {
         var4.c(1000L);
      } else {
         long var1 = var4.a();
         if (var1 > 0L) {
            var4.c(var1);
         }

         aadh var3;
         do {
            var3 = (aadh)var4.c.poll();
            if (var3 == null) {
               var3 = null;
               break;
            }
         } while(!var3.b());

         if (var3 != null) {
            var3.a();
            var4.b();
         }

      }
   }
}

