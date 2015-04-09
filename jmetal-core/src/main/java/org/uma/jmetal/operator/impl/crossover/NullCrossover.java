//  This program is free software: you can redistribute it and/or modify
//  it under the terms of the GNU Lesser General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or
//  (at your option) any later version.
//
//  This program is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU Lesser General Public License for more details.
// 
//  You should have received a copy of the GNU Lesser General Public License
//  along with this program.  If not, see <http://www.gnu.org/licenses/>.

package org.uma.jmetal.operator.impl.crossover;

import org.uma.jmetal.operator.CrossoverOperator;
import org.uma.jmetal.solution.Solution;
import org.uma.jmetal.util.JMetalException;

import java.util.List;

/**
 * This class defines a null crossover operator: the parent solutions are returned without any
 * change.
 *
 * @author Antonio J. Nebro
 * @version 1.0
 */
public class NullCrossover<Source extends List<? extends Solution>, Result extends List<? extends Solution>>
    implements CrossoverOperator<Source, Result> {

  /** Execute() method */
  @Override public Result execute(Source source) {
    if (null == source) {
      throw new JMetalException("Null parameter") ;
    } else if (source.size() != 2) {
      throw new JMetalException("There must be two parents instead of " + source.size()) ;
    }

    return (Result) source ;
  }
}
