package Assignment4;

//Jlon Manning JManning5612@toromail.csudh.edu

import java.io.*;
import java.util.NoSuchElementException;

// MyScanner is my version of the Scanner Class using the methods given
public class MyScanner {
    private BufferedReader reader;
    private String delimiter = "\\s+";

    public MyScanner(InputStream source) {
        this.reader = new BufferedReader(new InputStreamReader(source));
    }

    //MyScanner produces values scanned from the specified file, @param source the file to be scanned and throws FileNotFoundException if the file is not found

    public MyScanner(File source) throws FileNotFoundException {
        this.reader = new BufferedReader(new FileReader(source));
    }

    //MyScanner produces values scanned from the specified string, @param source the string to be scanned
     
    public MyScanner(String source) {
        this.reader = new BufferedReader(new StringReader(source));
    }

    // Finds and returns the next complete token from this scanner. @return the next token @throws NoSuchElementException if no more tokens are available
    public String next() throws NoSuchElementException {
        try {
            StringBuilder token = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                if (Character.toString(c).matches(delimiter)) {
                    if (token.length() > 0) break;
                } else {
                    token.append((char) c);
                }
            }
            if (token.length() == 0) throw new NoSuchElementException();
            return token.toString();
        } catch (IOException e) {
            throw new NoSuchElementException();
        }
    }

    // Scans the next token of the input as an integer @return the int scanned from the input, @throws InputMismatchException if the next token does not match the Integer pattern ,@throws NoSuchElementException if no more tokens are available

    public int nextInt() throws InputMismatchException, NoSuchElementException {
        String token = next();
        try {
            return Integer.parseInt(token);
        } catch (NumberFormatException e) {
            throw new InputMismatchException();
        }
    }

    // Scans the next token of the input as a double, @return the double scanned from the input, @throws InputMismatchException if the next token does not match the Double pattern @throws NoSuchElementException if no more tokens are available
     
    public double nextDouble() throws InputMismatchException, NoSuchElementException {
        String token = next();
        try {
            return Double.parseDouble(token);
        } catch (NumberFormatException e) {
            throw new InputMismatchException();
        }
    }

    //Scans the next token of the input as a long, @return the long scanned from the input, @throws InputMismatchException if the next token does not match the Long pattern @throws NoSuchElementException if no more tokens are available
     
    public long nextLong() throws InputMismatchException, NoSuchElementException {
        String token = next();
        try {
            return Long.parseLong(token);
        } catch (NumberFormatException e) {
            throw new InputMismatchException();
        }
    }

    //Scans the next token of the input as a float, @return the float scanned from the input, @throws InputMismatchException if the next token does not match the Float pattern, @throws NoSuchElementException if no more tokens are available
 
    public float nextFloat() throws InputMismatchException, NoSuchElementException {
        String token = next();
        try {
            return Float.parseFloat(token);
        } catch (NumberFormatException e) {
            throw new InputMismatchException();
        }
    }

    //Scans the next token of the input as a short, @return the short scanned from the input, @throws InputMismatchException if the next token does not match the Short pattern, @throws NoSuchElementException if no more tokens are available
    public short nextShort() throws InputMismatchException, NoSuchElementException {
        String token = next();
        try {
            return Short.parseShort(token);
        } catch (NumberFormatException e) {
            throw new InputMismatchException();
        }
    }

    //Scans the next token of the input as a byte, @return the byte scanned from the input, @throws InputMismatchException if the next token does not match the Byte pattern, @throws NoSuchElementException if no more tokens are available
    public byte nextByte() throws InputMismatchException, NoSuchElementException {
        String token = next();
        try {
            return Byte.parseByte(token);
        } catch (NumberFormatException e) {
            throw new InputMismatchException();
        }
    }

    //Advances the scanner past the current line and returns the input that was skipped, @return the line that was skipped, @throws NoSuchElementException if no line was found
    public String nextLine() throws NoSuchElementException {
        try {
            String line = reader.readLine();
            if (line == null) throw new NoSuchElementException();
            return line;
        } catch (IOException e) {
            throw new NoSuchElementException();
        }
    }

    //Scans the next token of the input as a boolean, @return the boolean scanned from the input, @throws InputMismatchException if the next token does not match the Boolean pattern, @throws NoSuchElementException if no more tokens are available
    public boolean nextBoolean() throws InputMismatchException, NoSuchElementException {
        String token = next();
        if (token.equalsIgnoreCase("true") || token.equalsIgnoreCase("false")) {
            return Boolean.parseBoolean(token);
        } else {
            throw new InputMismatchException();
        }
    }

    //Sets the delimiter pattern of the scanner, @param pattern the delimiter pattern
    
    public void useDelimiter(String pattern) {
        this.delimiter = pattern;
    }

    //Returns true if this scanner has another token in its input,@return true if there is another token, false otherwise
    public boolean hasNext() {
        try {
            reader.mark(1);
            if (reader.read() < 0) {
                return false;
            }
            reader.reset();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    //Returns true if the next token in this scanner's input can be interpreted as an int value, @return true if the next token can be interpreted as an int, false otherwise
    public boolean hasNextInt() {
        try {
            reader.mark(1);
            String token = next();
            reader.reset();
            Integer.parseInt(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Returns true if the next token in this scanner's input can be interpreted as a double value, @return true if the next token can be interpreted as a double, false otherwise
    public boolean hasNextDouble() {
        try {
            reader.mark(1);
            String token = next();
            reader.reset();
            Double.parseDouble(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Returns true if the next token in this scanner's input can be interpreted as a long value, @return true if the next token can be interpreted as a long, false otherwise
    public boolean hasNextLong() {
        try {
            reader.mark(1);
            String token = next();
            reader.reset();
            Long.parseLong(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Returns true if the next token in this scanner's input can be interpreted as a float value, @return true if the next token can be interpreted as a float, false otherwise
    public boolean hasNextFloat() {
        try {
            reader.mark(1);
            String token = next();
            reader.reset();
            Float.parseFloat(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Returns true if the next token in this scanner's input can be interpreted as a short value, @return true if the next token can be interpreted as a short, false otherwise
    public boolean hasNextShort() {
        try {
            reader.mark(1);
            String token = next();
            reader.reset();
            Short.parseShort(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Returns true if the next token in this scanner's input can be interpreted as a byte value ,@return true if the next token can be interpreted as a byte, false otherwise
    public boolean hasNextByte() {
        try {
            reader.mark(1);
            String token = next();
            reader.reset();
            Byte.parseByte(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Exception class
    public static class InputMismatchException extends RuntimeException {
        public InputMismatchException() {
            super("Input mismatch");
        }
    }

    // Exception class
    public static class NoSuchElementException extends RuntimeException {
        public NoSuchElementException() {
            super("No such element");
        }
    }
}
