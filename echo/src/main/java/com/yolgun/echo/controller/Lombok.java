package com.yolgun.echo.controller;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://projectlombok.org/features/
 *
 * val Finally! Hassle-free final local variables.
 * var Mutably! Hassle-free local variables.
 *
 * @NonNull or: How I learned to stop worrying and love the NullPointerException.
 * @Cleanup Automatic resource management: Call your close() methods safely with no hassle.
 * @Getter/@Setter Never write public int getFoo() {return foo;} again.
 * @ToString No need to start a debugger to see your fields: Just let lombok generate a toString for you!
 * @EqualsAndHashCode Equality made easy: Generates hashCode and equals implementations from the fields of your object..
 * @NoArgsConstructor, @RequiredArgsConstructor and @AllArgsConstructor
 * Constructors made to order: Generates constructors that take no arguments, one argument per final / non-nullfield, or one argument for every field.
 * @Data All together now: A shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields, and @Setter on all non-final fields, and @RequiredArgsConstructor!
 * @Value Immutable classes made very easy.
 * @Builder ... and Bob's your uncle: No-hassle fancy-pants APIs for object creation!
 * @SneakyThrows To boldly throw checked exceptions where no one has thrown them before!
 * @Synchronized synchronized done right: Don't expose your locks.
 * @Getter(lazy=true) Laziness is a virtue!
 * @Log Captain's Log, stardate 24435.7: "What was that line again?"
 */
@RestController
@RequestMapping("lombok")
@Slf4j
public class Lombok {

  private void nonnull(@NonNull Object o) {
    Assert.notNull(o, "o can't be null");
    // nothing;
  }

  @GetMapping("/val/{in}")
  public String val(@PathVariable String in) throws Exception {
    val i = in;
//    i = i; // Does not compile. final

    try {
      nonnull(null);
    } catch (Exception e) {
      // expected
    }

    return i;
  }
}
