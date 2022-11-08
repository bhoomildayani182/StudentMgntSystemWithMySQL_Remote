//package in.ac.charusat.studentmgmtsystem.utility;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import org.springframework.beans.factory.annotation.Value;
//
//import java.io.Serializable;
//import java.util.Date;
//import java.util.function.Function;
//
//public class JWTUtility implements Serializable {
//
//    private static final long serialVersionUID=234234523523L;
//    private static final long JWT_TOKEN_VELIDITY=5*60*50;
//
//    @Value("${jwt.secret}")
//    private String secretKey;
//
//    public String getUsernameFromToken(String token){
//        return getCliamFromToken(token, Claims::getSubject);
//    }
//
//    public Date getExpirationDateFromToken(String token){
//        return getCliamFromToken(token, Claims::getExpiration);
//    }
//
//    private <T> T getCliamFromToken(String token, Function<Claims, T> claimsTFunction) {
//        final Claims claims = getAllCliamFromToken(token);
//        return claimsResolver.apply(claims);
//    }
//
//    private Claims getAllCliamFromToken(String token) {
//        return Jwts.parser().setSigningKey(secretKey).parseClaimsJwt(token).getBody();
//    }
//
//
//
//}
