import android.graphics.Point;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class aacv {
   public final String a;
   public final zgk b;

   private aacv(String var1, zgk var2) {
      this.a = var1;
      this.b = var2;
   }

   public static Point a(String var0, int var1, int var2, Locale var3) {
      aacv var8 = b(var0, var3);
      Point var11 = null;
      int var5 = 0;
      int var4 = var2;

      while(true) {
         zgk var12 = var8.b;
         boolean b1 = var5 >= var12.c - 1;
         if (b1) {
            return var11;
         }

         String var9 = var8.a;
         int var7 = var12.a(var5);
         zgk var10 = var8.b;
         int var6 = var5 + 1;
         Point var13 = var11;
         var2 = var4;
         if (e(var9.substring(var7, var10.a(var6)))) {
            if (var8.b.a(var5) <= var1 && var8.b.a(var6) > var1) {
               return new Point(var8.b.a(var5), var8.b.a(var6));
            }

            if (var8.b.a(var6) <= var1) {
               var7 = var1 - var8.b.a(var6) + 1;
               var13 = var11;
               var2 = var4;
               if (var7 <= var4) {
                  var13 = var11;
                  if (var11 == null) {
                     var13 = new Point(0, 0);
                  }

                  var13.set(var8.b.a(var5), var8.b.a(var6));
                  var2 = var7;
               }
            } else {
               var7 = var8.b.a(var5) - var1;
               var13 = var11;
               var2 = var4;
               if (var7 <= var4) {
                  var13 = var11;
                  if (var11 == null) {
                     var13 = new Point(0, 0);
                  }

                  var13.set(var8.b.a(var5), var8.b.a(var6));
                  var2 = var7;
               }
            }
         }

         var5 = var6;
         var11 = var13;
         var4 = var2;
      }
   }

   public static aacv b(String var0, Locale var1) {
      BreakIterator var3;
      if (var1 != null) {
         var3 = BreakIterator.getWordInstance(var1);
      } else {
         var3 = BreakIterator.getWordInstance();
      }

      var3.setText(var0);
      zgv var2 = new zgv();

      do {
         var2.d(var3.current());
      } while(var3.next() != -1);

      return new aacv(var0, var2);
   }

   public static List c(String var0) {
      ArrayList var6 = new ArrayList();
      zgk var5 = b(var0, (Locale)null).b;
      int var3 = var5.c;

      int var2;
      for(int var1 = 0; var1 < var3; var1 = var2) {
         var2 = var1 + 1;
         int var4 = var5.a(var1);
         if (var1 >= var3 - 1) {
            var1 = var0.length();
         } else {
            var1 = var5.a(var2);
         }

         if (e(var0.substring(var4, var1))) {
            var6.add(new aaby(var4, var1));
         }
      }

      return var6;
   }

   public static List d(String var0) {
      ArrayList var5 = new ArrayList();
      zgk var6 = b(var0, (Locale)null).b;
      int var3 = var6.c;

      int var2;
      for(int var1 = 0; var1 < var3; var1 = var2) {
         var2 = var1 + 1;
         int var4 = var6.a(var1);
         if (var1 >= var3 - 1) {
            var1 = var0.length();
         } else {
            var1 = var6.a(var2);
         }

         if (e(var0.substring(var4, var1))) {
            var5.add(var0.substring(var4, var1));
         }
      }

      return var5;
   }

   private static boolean e(String var0) {
      for(int var1 = 0; var1 < var0.length(); ++var1) {
         if (Character.isLetterOrDigit(var0.codePointAt(var1))) {
            return true;
         }
      }

      return false;
   }
}

