/* Copyright 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package geb.content

import geb.navigator.Locator
import geb.navigator.Navigator
import org.openqa.selenium.WebElement

interface Navigable extends Locator {

	Navigator find()

	Navigator $()

	Navigator find(int index)

	Navigator find(Range<Integer> range)

	Navigator $(int index)

	Navigator $(Range<Integer> range)

	Navigator $(Navigator[] navigators)

	Navigator $(WebElement[] elements)
}